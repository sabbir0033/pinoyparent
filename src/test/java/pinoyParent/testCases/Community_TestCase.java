package pinoyParent.testCases;

import org.testng.annotations.Test;

import pinoyParent.functionalities.Community;
import pinoyParent.functionalities.Login;

public class Community_TestCase extends BaseClass{

	@Test(priority = 1)
	public void communityNewPostCreation() throws InterruptedException {
		Login.login();
		Community.createNewPost();
		
	}
	
	@Test(priority = 2)
	public void communityNewPostLikeUnlike() throws InterruptedException {
		Login.login();
		Community.likeUnlikePost();
	}
	
	
	@Test(priority = 3)
	public void communityNewPostComment() throws InterruptedException {
		Login.login();
		Community.commentOnPost();
	}
	
	
	@Test(priority = 4)
	public void communityNewPostShare() throws InterruptedException {
		Login.login();
		Community.sharePost();
	}
	
	
	@Test(priority = 5)
	public void communityNewPostReport() throws InterruptedException {
		Login.login();
		Community.reportPost();
	}
	
	
	@Test(priority = 6)
	public void communityList() throws InterruptedException {
		Login.login();
		Community.allCommunityListPage();
	}
	
	
	@Test(priority = 7)
	public void communityJoined() throws InterruptedException {
		Login.login();
		Community.joinInaCommunity();
	}
	
	
	
	@Test(priority = 8)
	public void Newcommunity() throws InterruptedException {
		Login.login();
		Community.suggestNewCommunity();
	}
	
	
	
}
