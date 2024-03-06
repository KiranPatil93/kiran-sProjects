Feature:Launch the Browser
@launch
  Scenario: Launching the browser
  '--remote-allow-origins=*'
  * configure driver = {type: 'chrome', addOptions: ['--disable-save-password-bubble']}
  Given driver 'https://yexledemo.appiancloud.com/suite/sites/automation-cases'
    * maximize()
    * driver.fullscreen()
