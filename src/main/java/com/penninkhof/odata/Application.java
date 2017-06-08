package com.penninkhof.odata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.penninkhof.odata.entities.Member;
import com.penninkhof.odata.repository.MemberRepository;
import com.penninkhof.odata.entities.Task;
import com.penninkhof.odata.repository.TaskRepository;
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(final TaskRepository repository) {
	    return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				if (repository.count() == 0) {
					repository.save(new Task(1, "Task Teste", "Teste descrição"));
				}
	        }
	    };
	}
}