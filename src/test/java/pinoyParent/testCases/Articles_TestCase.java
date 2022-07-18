package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.Articles;
import pinoyParent.functionalities.Login;

public class Articles_TestCase extends BaseClass{

	@Test(priority = 1)
	public void articles() throws InterruptedException {
		Login.login();
		Articles.ourArtcles();
		
	}
	
	
	@Test(priority = 2)
	public void reactOnarticles() throws InterruptedException {
		Login.login();
		Articles.reactOnArticles();
		
	}
	
	
	@Test(priority = 3)
	public void saveArticles() throws InterruptedException {
		Login.login();
		Articles.saveSingleArticles();
		
	}
	
	
	@Test(priority = 4)
	public void shareArticles() throws InterruptedException {
		Login.login();
		Articles.shareSingleArticles();
		
	}
	
	
	@Test(priority = 5)
	public void downloadArticles() throws InterruptedException {
		Login.login();
		Articles.downloadSingleArticle();
		
	}
	
	
	@Test(priority = 6)
	public void extinsiveArticles() throws InterruptedException {
		Login.login();
		Articles.extensiveArticleView();
		
	}
	
	
	@Test(priority = 7)
	public void savedArticles() throws InterruptedException {
		Login.login();
		Articles.savedArticles();
		
	}
	
	@Test(priority = 8)
	public void downloadedArticles() throws InterruptedException {
		Login.login();
		Articles.downloadedArticles();
		
	}
}
