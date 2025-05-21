package in.raj.sbean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@Data
@ConfigurationProperties(prefix = "info.app")
public class ProjectInfo {
    private String name;
    private String version;
    private String createdBy;
    private String stable;
    private String teamName;
}
