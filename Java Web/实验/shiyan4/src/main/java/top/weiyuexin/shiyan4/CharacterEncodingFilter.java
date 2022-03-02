package top.weiyuexin.shiyan4;

import javax.servlet.*;
import java.io.IOException;

public class CharacterEncodingFilter implements Filter {
    protected String encoding;
    public void init(FilterConfig config) throws ServletException {
        /*获取初始话参数*/
        this.encoding = config.getInitParameter("encoding");
    }
    public void destroy() {}
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
       if(encoding!=null){
           /*设置请求报文的字符编码*/
           System.out.println("设置了编码");
           request.setCharacterEncoding(encoding);
       }
        chain.doFilter(request, response);
    }
}
