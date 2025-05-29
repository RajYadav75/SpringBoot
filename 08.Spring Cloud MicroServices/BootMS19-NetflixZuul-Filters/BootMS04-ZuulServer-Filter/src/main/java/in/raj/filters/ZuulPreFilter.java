package in.raj.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ZuulPreFilter extends ZuulFilter {

    private static final Logger logger = LoggerFactory.getLogger(ZuulPreFilter.class);
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
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
        //TODO:- Get Request Context Object
        RequestContext context = RequestContext.getCurrentContext();
        //TODO:- Get HTTPServletRequest Object
        HttpServletRequest request = context.getRequest();
        logger.info("==============From Zuul Pre Filter==============");
        logger.info("Request Mode :: "+request.getMethod());
        logger.info("Request Content Type :: "+request.getContentType());
        logger.info("Request Content Length :: "+request.getContentLength());
        logger.info("Request URI :: "+request.getRequestURI());
        logger.info("Request Path :: "+request.getServletPath());
        return null;
    }
}
