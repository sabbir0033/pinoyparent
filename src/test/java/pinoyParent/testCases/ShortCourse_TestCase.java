package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.Login;
import pinoyParent.functionalities.ShortCourse;

public class ShortCourse_TestCase extends BaseClass{

	@Test(priority = 1)
	public void shortCourseDetailPage() throws InterruptedException {
		Login.login();
		ShortCourse.courceDetails();
	}
	
	@Test(priority = 2)
	public void courceReact() throws InterruptedException {
		Login.login();
		ShortCourse.reactOnSingleCoursePage();
	}
	
	
	@Test(priority = 3)
	public void courceSave() throws InterruptedException {
		Login.login();
		ShortCourse.saveSingleCoursePage();
	}
	
	
	@Test(priority = 4)
	public void courceShare() throws InterruptedException {
		Login.login();
		ShortCourse.shareSingleCoursePage();
	}
	
	@Test(priority = 5)
	public void courceDownload() throws InterruptedException {
		Login.login();
		ShortCourse.downloadSingleCoursePage();
	}
	
	@Test(priority = 6)
	public void courceEnrolled() throws InterruptedException {
		Login.login();
		ShortCourse.enrollSingleCoursePage();
	}
	
	@Test(priority = 7)
	public void playVideo() throws InterruptedException {
		Login.login();
		ShortCourse.playSingleCourseVideo();
	}
	
	
	@Test(priority = 8)
	public void savedCourseList() throws InterruptedException {
		Login.login();
		ShortCourse.savedCourses();
	}
	
	
	@Test(priority = 9)
	public void downloadedCourseList() throws InterruptedException {
		Login.login();
		ShortCourse.downloadedCourses();
	}
}
