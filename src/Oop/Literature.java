package Oop;

public class Literature {


    // создаем поля(переменные)
    public String auth;
    public int page;
    public int cost;
    public String lang;
    public String content;

    public Literature(String _auth, int _page, int _cost, String _lang,String _content ) {
        System.out.println("Объект создан");
        SetValue(_auth,_page,_cost,_lang,_content);
        System.out.println(getValue());

    }

    public void SetValue(String _auth, int _page, int _cost, String _lang,String _content ){
        auth = _auth;
        page = _page;
        cost = _cost;
        lang = _lang;
        content = _content;
    }




    public String getValue() {
        return "Автор : " + auth + ", количество страниц : " + page + ", Цена книги : " + cost + ", Язык:  " + lang + ", Жанр:  " + content;

    }


}
