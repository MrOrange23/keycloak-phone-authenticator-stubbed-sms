package foo.bar;

import com.hfx.keycloak.spi.SmsService;
import com.hfx.keycloak.spi.SmsServiceProviderFactory;
import org.keycloak.Config.Scope;
import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;

public class StubbedSmsServiceProviderFactory implements SmsServiceProviderFactory {

  @Override
  public SmsService create(KeycloakSession keycloakSession) {
    return new StubbedSmsService(keycloakSession);
  }

  @Override
  public void init(Scope scope) {

  }

  @Override
  public void postInit(KeycloakSessionFactory keycloakSessionFactory) {

  }

  @Override
  public void close() {

  }

  @Override
  public String getId() {
    return "StubbedSmsServiceProviderFactory";
  }
}
