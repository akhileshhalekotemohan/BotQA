# BotQA

This is a web test automation framework designed which is generic. With few customization this can be used to test any web page.

## Set up

1. Clone the project 
2. Please make sure your chrome browser version is <93 
3. Open the terminal and go to project directory and further down to src/test/java/resources
4. Applicable only for Mac OS >Catalina. Run this command ``` $xattr -d com.apple.quarantine chromedriver``` [On MacOS catalina there is a higher security, which will avoid any executable downloaded from internet from running. This will be different from manulally installed application where it asks for permission explicitly. So you have to remove quarantine flag]  
5. Run the test from TestSuite
6. Now this is only supported on Chromedriver. But we are updating it for other browsers and we will release an update soon.

And you are good to go.

## Future upgrades.
1. Supporting mulitple browsers
2. Improving performance
3. For running this on any other OS you have to download respective chromedrive and change the system path accordingly. But we will release an update with new configuration which will make it easy to run on atleast Mac, Linux and Windows on the fly.



For any queries email me at @ akhilu15@gmail.com
