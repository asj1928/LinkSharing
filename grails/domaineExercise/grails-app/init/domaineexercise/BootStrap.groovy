package domaineexercise

class BootStrap {

    def init = { servletContext ->
        User user= new User()
        user.email="asjodha22@gmail.com"
        user.userName="asj1928"
        user.password="harinder"
        user.firstName="ajay"
        user.save()
    }
    def destroy = {
    }
}
