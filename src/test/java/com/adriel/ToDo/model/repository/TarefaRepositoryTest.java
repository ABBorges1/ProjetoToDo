package com.adriel.ToDo.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.adriel.ToDo.model.entity.Tarefa;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class TarefaRepositoryTest {

	@Autowired
	TarefaRepository repository;

	@Autowired
	TestEntityManager entityManager;

	@Test
	public void deveVerificarAExistenciaDeUmaTarefa() {
		// Cenário
		Tarefa tarefa = criarTarefa();
		entityManager.persist(tarefa);

		// Ação / Execução
		boolean result = repository.existsByNome("Teste");

		// Verificação
		Assertions.assertThat(result).isTrue();
	}

	public static Tarefa criarTarefa() {
		return Tarefa
				.builder()
				.nome("Teste")
				.descricao("Usado para teste")
				.observacoes("Essa tarefa não conta, é só um teste.")
				.build();
	}
}
