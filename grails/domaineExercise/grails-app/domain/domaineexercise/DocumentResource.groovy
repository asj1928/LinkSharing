package domaineexercise

class DocumentResource extends Resource{
    String filePath
    Date dateCreated
    Date lastUpdated


    static constraints = {
        filePath nullable: false
    }
}
