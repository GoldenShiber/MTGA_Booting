package securityEssentials;

import javax.naming.AuthenticationException;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;

public interface AuthenticationProvider {

	Authentication authenticate(Authentication authentication)
			throws AuthenticationException;

	boolean supports(Class<?> authentication);
}