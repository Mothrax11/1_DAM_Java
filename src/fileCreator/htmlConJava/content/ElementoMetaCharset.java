package fileCreator.htmlConJava.content;

public class ElementoMetaCharset extends ElementoSinContenido {

    public ElementoMetaCharset (String charset){
        super("meta", true);
        try {
        anadirAtributo("charset", charset);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public ElementoMetaCharset (){
        this("UTF-8");
    }
    
}
