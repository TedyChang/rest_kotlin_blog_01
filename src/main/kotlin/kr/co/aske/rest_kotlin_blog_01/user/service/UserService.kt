package kr.co.aske.rest_kotlin_blog_01.user.service

class UserService {
    fun funcLogin(email:String, password: String): Boolean {
        if (email == "admin" && password == "admin"){
            return true
        }
        return false
    }

}