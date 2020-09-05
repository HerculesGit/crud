package com.herco.crud.exception;

import java.util.Date;

/**
 * @author Hercules S. Souza
 * Heres what happens when you fire a request to not resource found: http://localhost:8080/some-dummy-url
 * {
 *   "timestamp": 1512713804164,
 *   "status": 404,
 *   "error": "Not Found",
 *   "message": "No message available",
 *   "path": "/some-dummy-url"
 * }
 * */
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
