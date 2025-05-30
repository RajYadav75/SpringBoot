package in.raj.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class ZuulErrorFilter extends ZuulFilter {
    private  static final Logger log= LoggerFactory.getLogger(ZuulErrorFilter.class);
    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
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
        //TODO:- Get Request Context objects
        RequestContext ctx = RequestContext.getCurrentContext();
        System.out.println("ZuulErrorFilter.run :: From ERROR FILTER");
        // Todo:- Get throwable object
        Throwable th = ctx.getThrowable();
        // TODO:- Write Log message about current request
        log.info("===========Zuul Error Filter =============");
        log.error("Exception message is :: "+th.getMessage()+"Exception class is :: "+th);
        return null;
    }
}
