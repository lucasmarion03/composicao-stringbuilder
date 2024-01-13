package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Tenha uma boa viagem");
		Comment c2 = new Comment("Nossa! Que legal");
		
		Post p1 = new Post(
				sdf.parse("13/01/2024 12:42:35"), 
				"Viagem para a Nova Zelândia", 
				"Mal posso esperar para chegar", 
				12
				);
		p1.comentar(c1);
		p1.comentar(c2);
		
		Comment c3 = new Comment("Boa noite");
		Comment c4 = new Comment("Bons sonhos");
		Post p2 = new Post(
				sdf.parse("13/01/2024 12:58:54"),
				"Boa noite pessoal",
				"Vejo vocês amanhã",
				5
				);
		p2.comentar(c3);
		p2.comentar(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
