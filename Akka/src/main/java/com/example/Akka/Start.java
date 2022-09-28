package com.example.Akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Start {

	public static void main(String[] args) {


		// Criação de um Actor System, que é o container Akka.
		ActorSystem system = ActorSystem.create("HelloSystem");

		// Criando o ator EcoActor
		ActorRef ecoActor = system.actorOf(Props.create(EcoActor.class), "eco");

		// Enviando a mensagem ao ator
		ecoActor.tell(new HelloMessage(), ActorRef.noSender());


	}

}
