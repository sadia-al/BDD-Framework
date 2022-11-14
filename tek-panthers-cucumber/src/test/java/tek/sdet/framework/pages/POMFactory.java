package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
//it is private beacuew without instance of POM no oone can access these parameters
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	//it return instance of class we created

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();

	}

	public RetailHomePage homePage() {
		return this.homePage;

	}

	public RetailSignInPage signInPage() {
		return this.signInPage;
	}

}
