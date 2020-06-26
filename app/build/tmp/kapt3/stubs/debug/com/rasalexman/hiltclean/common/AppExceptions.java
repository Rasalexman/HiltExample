package com.rasalexman.hiltclean.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0006\u0007B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005\u0082\u0001\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/rasalexman/hiltclean/common/AppExceptions;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "NullResponseDataException", "NullResultDataException", "Lcom/rasalexman/hiltclean/common/AppExceptions$NullResponseDataException;", "Lcom/rasalexman/hiltclean/common/AppExceptions$NullResultDataException;", "app_debug"})
public abstract class AppExceptions extends java.lang.Exception {
    
    private AppExceptions(java.lang.String message) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rasalexman/hiltclean/common/AppExceptions$NullResponseDataException;", "Lcom/rasalexman/hiltclean/common/AppExceptions;", "()V", "app_debug"})
    public static final class NullResponseDataException extends com.rasalexman.hiltclean.common.AppExceptions {
        public static final com.rasalexman.hiltclean.common.AppExceptions.NullResponseDataException INSTANCE = null;
        
        private NullResponseDataException() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/rasalexman/hiltclean/common/AppExceptions$NullResultDataException;", "Lcom/rasalexman/hiltclean/common/AppExceptions;", "()V", "app_debug"})
    public static final class NullResultDataException extends com.rasalexman.hiltclean.common.AppExceptions {
        public static final com.rasalexman.hiltclean.common.AppExceptions.NullResultDataException INSTANCE = null;
        
        private NullResultDataException() {
            super(null);
        }
    }
}