package utils;

import exception.NoPropertiesException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.text.MessageFormat;
import java.util.Properties;

public class PropertyLoader {

    private static final Logger LOGGER = LogManager.getLogger();

    private PropertyLoader() {}

    public static String retornarValorArquivoConfiguracao(final String propriedade) {
        Properties properties = new Properties();
        String env = Environment.getEnvironment();
        String separadorArquivo = System.getProperty("file.separator");

        try (InputStream propFileInpStream = PropertyLoader.class.getClassLoader()
                .getResourceAsStream("ambientes" + separadorArquivo + env + separadorArquivo + "config.properties")) {

            properties.load(propFileInpStream);
            LOGGER.info(MessageFormat.format("Buscando {0} no arquivo ambientes/{1}/config.properties: {2}", propriedade, env, properties.getProperty(propriedade)));

            return properties.getProperty(propriedade);
        } catch (IOException e) {
            LOGGER.error(MessageFormat.format("Propriedade {0} ou diretorio ambientes/{1}/ não foi encontrada nos arquivos de configuração", propriedade, env), e);
            throw new NoPropertiesException("Sem arquivo de configuração!");
        }
    }
}
