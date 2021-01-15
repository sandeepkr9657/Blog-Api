package com.example.springngblog.exception;
public class PostNotFoundException extends RuntimeException 
{
	public PostNotFoundException(String message) 
	{
        super(message);
    }
}
