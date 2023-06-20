package com.store.store.exceptions;

import com.store.store.DTOs.exceptions.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingRequestHeaderException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.http.converter.HttpMessageNotReadableException;

@ControllerAdvice
public class GlobalException {
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            DuplicateKeyException.class,
            HttpRequestMethodNotSupportedException.class,
            MethodArgumentNotValidException.class,
            MissingRequestHeaderException.class,
            MissingServletRequestParameterException.class,
            MethodArgumentTypeMismatchException.class,
            HttpMessageNotReadableException.class
    })
    @ResponseBody
    public ResponseEntity<ExceptionDTO> badRequest(Exception ex, HttpServletRequest request){
        System.out.println("bad request");
        ExceptionDTO exDTO = new ExceptionDTO(ex, request);
        ex.printStackTrace();
        return new ResponseEntity<ExceptionDTO>(exDTO, HttpStatus.BAD_REQUEST);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            ResourceNotFoundException.class
    })
    @ResponseBody
    public ResponseEntity<ExceptionDTO> notFoundRequest(Exception ex, HttpServletRequest request){
        System.out.println("resource" + ex.getMessage());
        ExceptionDTO exDTO = new ExceptionDTO(ex, request);
        ex.printStackTrace();
        return new ResponseEntity<ExceptionDTO>(exDTO, HttpStatus.NOT_FOUND);
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({
            Exception.class
    })
    @ResponseBody
    public ResponseEntity<ExceptionDTO> fatalErrorUnexpectedError(Exception ex,HttpServletRequest request){
        System.out.println("internal server error");
        ex.printStackTrace();
        ExceptionDTO exDTO = new ExceptionDTO(ex, request);
        return new ResponseEntity<ExceptionDTO>(exDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }



    /*
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({NotFoundException.class})
    @RequestBody
    public ErrorMessage notFoundRequest(Exception ex, HttpServletRequest request){
        return new ErrorMessage(ex,request.getRequestURI());
    }
    */

    /*@ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({
            BadRequestException.class,
            org.springframework.dao.DuplicateKeyException.class,
            org.springframework.web.HttpRequestMethodNotSupportedException.class,
            org.springframework.web.bind.MethodArgumentNotValidException.class,
            org.springframework.web.bind.MissingRequestHeaderException.class,
            org.springframework.web.bind.MissingServletRequestParameterException.class,
            org.springframework.web.method.annotation.MethodArgumentTypeMismatchException.class,
            org.springframework.http.converter.HttpMessageNotReadableException.class
    })
    @ResponseBody
    public ErrorMessage badRequest(Exception ex, HttpServletRequest request){
        return new ErrorMessage(ex,request.getRequestURI());
    }*/

    /*
    @ResponseStatus(HttpStatus.FORBIDDEN)
    @ExceptionHandler({ForbiddenException.class})
    @ResponseBody
    public ErrorMessage forbiddenRequest(Exception ex,HttpServletRequest request){
        return new ErrorMessage(ex, request.getRequestURI());
    }
    */

    /*
    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler({ConflictException.class})
    @ResponseBody
    public ErrorMessage conflict(Exception ex,HttpServletRequest request){
        return new ErrorMessage(ex, request.getRequestURI());
    }
    */

/*
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({
    UnauthorizedException.class,
    org.springframework.security.access.AccessDeniedException.class
    })
    @ResponseBody
    public ErrorMessage unauthorized(){

    }
    */

    /*
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ErrorMessage fatalErrorUnexpectedError(Exception ex,HttpServletRequest request){
        return new ErrorMessage(ex, request.getRequestURI());
    }
    */
}
