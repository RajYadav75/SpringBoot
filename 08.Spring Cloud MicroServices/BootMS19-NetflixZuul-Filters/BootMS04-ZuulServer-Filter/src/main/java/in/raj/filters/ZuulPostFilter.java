package in.raj.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

@Component
public class ZuulPostFilter extends ZuulFilter {
    private  static final Logger log= LoggerFactory.getLogger(ZuulPostFilter.class);
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
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
        //Get Request Context Objects
        RequestContext ctx = RequestContext.getCurrentContext();
        // Get HttpServlet Response Object
        HttpServletResponse response = ctx.getResponse();
        System.out.println("ZuulPostFilter.run:: from POST FILTER");
        log.info("================Zuul Post Filter================");
        log.info("Response Content Type: " + response.getContentType());
        log.info("Response Status: " + response.getStatus());
        log.info("Request host name :: "+response.getHeader("Host"));
        return null;
    }
}
