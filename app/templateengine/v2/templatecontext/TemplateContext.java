package templateengine.v2.templatecontext;

import play.twirl.api.Html;

public class TemplateContext {
    public Html renderHeadElements(){
        return Html.apply("");
    }

    public String getTitle(){
        return "Template Engine V2";
    }
}
