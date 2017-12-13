package testsuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import testecases.NovoUsuarioTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	NovoUsuarioTestCase.class
	})
public class ComprasTestSuite {		
}		
