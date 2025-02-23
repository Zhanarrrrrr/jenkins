package tests;

import lib.CoreTestClass;
import lib.ui.ArticlePageObject;
import lib.ui.MyListsPageObject;
import lib.ui.NavigationUI;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class MyListsTest extends CoreTestClass {
    @Test
    public void testSwipeArticle() {
        SearchPageObject SearchPageObject = new SearchPageObject(driver);
        SearchPageObject.skipDisclaimer();
        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("music");
        String name_of_folder = "Fav";
        ArticlePageObject ArticlePageObject = new ArticlePageObject(driver);
        ArticlePageObject.addFirstArticleToSaved(name_of_folder);
        NavigationUI NavigationUI = new NavigationUI(driver);
        NavigationUI.clickMyList();
        ArticlePageObject.addSecondArticleToSaved();
        NavigationUI.clickMyList();
        NavigationUI.clickMyList();
        MyListsPageObject myListsPageObject = new MyListsPageObject(driver);
        myListsPageObject.navigateToMyList();
        myListsPageObject.displayList();
    }


}
