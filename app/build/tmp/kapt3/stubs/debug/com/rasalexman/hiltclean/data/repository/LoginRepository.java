package com.rasalexman.hiltclean.data.repository;

import java.lang.System;

/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/rasalexman/hiltclean/data/repository/LoginRepository;", "", "dataSource", "Lcom/rasalexman/hiltclean/data/datasource/local/LoginLocalDataSource;", "(Lcom/rasalexman/hiltclean/data/datasource/local/LoginLocalDataSource;)V", "getDataSource", "()Lcom/rasalexman/hiltclean/data/datasource/local/LoginLocalDataSource;", "isLoggedIn", "", "()Z", "<set-?>", "Lcom/rasalexman/hiltclean/model/local/LoggedInUser;", "user", "getUser", "()Lcom/rasalexman/hiltclean/model/local/LoggedInUser;", "login", "Lcom/rasalexman/hiltclean/data/Result;", "username", "Lcom/rasalexman/hiltclean/model/ui/user/UserName;", "password", "Lcom/rasalexman/hiltclean/model/ui/user/UserPassword;", "login-5ssTNms", "(Ljava/lang/String;Ljava/lang/String;)Lcom/rasalexman/hiltclean/data/Result;", "logout", "", "setLoggedInUser", "loggedInUser", "app_debug"})
public final class LoginRepository {
    @org.jetbrains.annotations.Nullable()
    private com.rasalexman.hiltclean.model.local.LoggedInUser user;
    @org.jetbrains.annotations.NotNull()
    private final com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource dataSource = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.rasalexman.hiltclean.model.local.LoggedInUser getUser() {
        return null;
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final void logout() {
    }
    
    private final void setLoggedInUser(com.rasalexman.hiltclean.model.local.LoggedInUser loggedInUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource getDataSource() {
        return null;
    }
    
    @javax.inject.Inject()
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.rasalexman.hiltclean.data.datasource.local.LoginLocalDataSource dataSource) {
        super();
    }
}