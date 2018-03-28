package domaineexercise

class LinkResource extends Resource{
    String url

    Date dateCreated
    Date lastUpdated

    static constraints = {
        url(url: true)
    }
}
