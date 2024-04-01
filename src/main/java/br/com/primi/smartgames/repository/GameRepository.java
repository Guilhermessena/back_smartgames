package br.com.primi.smartgames.repository;

import br.com.primi.smartgames.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//Após extender o Jpa, a interface
//possui métodos de persistência
//que atingem o banco de dados
public interface GameRepository extends JpaRepository<Game, Integer> {
}
