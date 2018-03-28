package linksharingchanged

class UtilController {


    def index() {


        log.debug("DEBUG")

        log.error("ERROR")
        log.info("INFO")

        render "Hello world"
    }
}
