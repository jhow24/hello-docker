package br.com.erudio;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	public HelloDocker greeting() {
		
		//var hostname = System.getenv("COMPUTERNAME");
		var hostname = System.getenv("HOSTNAME");
		
		return new HelloDocker(
				"Hello Docker",
					hostname);
	}
}
