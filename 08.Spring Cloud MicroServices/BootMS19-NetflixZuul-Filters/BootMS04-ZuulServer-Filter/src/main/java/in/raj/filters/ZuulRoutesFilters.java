package in.raj.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class ZuulRoutesFilters extends ZuulFilter {
    private  static final Logger log= LoggerFactory.getLogger(ZuulRoutesFilters.class);
    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // TODO:- get RequestContext obj
        RequestContext context=RequestContext.getCurrentContext();
        // TODO:- write the log messages related  Routing
        log.info("========Zuul  Route Filter ======");
//        log.info("Routing Host name :"+context.getRouteHost().toString());
//        log.info(" Routing details ::"+context.getFilterExecutionSummary());
        return null;
    }
}
