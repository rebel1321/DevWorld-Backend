package com.tech.DevelopmentApp.Response;


    public class AuthResponse {

        private String jwt;
        private String Message;

        public AuthResponse(){

        }

        public AuthResponse(String jwt, String message) {
            super();
            this.jwt = jwt;
            Message = message;
        }

        public String getJwt() {
            return jwt;
        }

        public void setJwt(String jwt) {
            this.jwt = jwt;
        }

        public String getMessage() {
            return Message;
        }

        public void setMessage(String message) {
            Message = message;
        }
    }

