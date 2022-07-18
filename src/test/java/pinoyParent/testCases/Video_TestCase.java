package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.Login;
import pinoyParent.functionalities.Video;

public class Video_TestCase extends BaseClass{

	@Test(priority = 1)
	public void videoReact() throws InterruptedException {
		Login.login();
		Video.reactOnVideo();
	}
	
	
	@Test(priority = 2)
	public void videoSave() throws InterruptedException {
		Login.login();
		Video.saveSingleVideo();
	}
	
	
	@Test(priority = 3)
	public void videoShare() throws InterruptedException {
		Login.login();
		Video.shareSingleVideo();
	}
	
	
	@Test(priority = 4)
	public void videoDownload() throws InterruptedException {
		Login.login();
		Video.downloadSingleVideo();
	}
	
	
	@Test(priority = 5)
	public void videoEnrolled() throws InterruptedException {
		Login.login();
		Video.enrollSingleVideo();
	}
	
	
	@Test(priority = 6)
	public void playVideo() throws InterruptedException{
		Login.login();
		Video.playSingleVideo();
	}
	
	
	@Test(priority = 7)
	public void webinar() throws InterruptedException{
		Login.login();
		Video.webinarList();
	}
	
	
	@Test(priority = 8)
	public void savedVideoList() throws InterruptedException{
		Login.login();
		Video.savedVideo();
	}
	
	@Test(priority = 9)
	public void downloadedVideoList() throws InterruptedException{
		Login.login();
		Video.downloadedVideo();
	}
	
	
	@Test(priority = 10)
	public void Webinars() throws InterruptedException{
		Login.login();
		Video.playWebinar();
	}
	
}
