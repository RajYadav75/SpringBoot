package in.raj.client;

import in.raj.entity.IPLTeam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient("TeamService")
public interface ConsumingProviderMSIPLTeam {

    @GetMapping("/team-api/find/{id}")
    public IPLTeam getIPLTeamById(@PathVariable int id);
}
