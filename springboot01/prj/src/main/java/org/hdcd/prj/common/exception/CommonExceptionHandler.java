package org.hdcd.prj.common.exception;

import org.hdcd.prj.exception.NotEnoughCoinException;
import org.hdcd.prj.exception.NotMyItemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.nio.file.AccessDeniedException;

@ControllerAdvice
public class CommonExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CommonExceptionHandler.class);

    @ExceptionHandler(NotEnoughCoinException.class)
    public String handleNotEnoughCoinException(NotEnoughCoinException ex, WebRequest request) {
        logger.info("handleNotEnoughCoinException");

        return "redirect:/coin/notEnoughCoin";
    }

    @ExceptionHandler(NotMyItemException.class)
    public String handleNotMyItemException(NotMyItemException ex, WebRequest request) {
        logger.info("handleNotMyItemException");

        return "redirect:/useritem/notMyItem";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public void handleAccessDeniedException(AccessDeniedException ex, HttpServletRequest request
                                        , HttpServletResponse response) throws Exception {
        if (isAjax(request)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        } else {
            throw ex;
        }
    }

    @ExceptionHandler(Exception.class)
    public String handle(Exception ex) {
        logger.info("handle ex " + ex.toString());

        return "error/errorCommon";
    }

    public static boolean isAjax(HttpServletRequest request) {
        return "XMLHttpRequest".equals(request.getHeader("X-Requested-With"));
    }
}
