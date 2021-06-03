# LAB 03
## EXERCISE 
Before making any changes to my code, I ran DateTest with jacoco coverage in Intellij and this is what I got:

![date test with coverage](https://user-images.githubusercontent.com/72233859/120697124-5752d580-c47b-11eb-9af5-5bd27e35494c.jpg)

I was tasked with trying to get as close to 100% as possible. So I made some additions to DateTest. After I ran with coverage and got this:

![dateTest after multiple tests, not 100](https://user-images.githubusercontent.com/72233859/120697253-7fdacf80-c47b-11eb-98d9-66b8b08e653b.jpg)

I noticed in the source code, there were a few statements in some methods that could be combined into one and a few if statements that could have been broken apart seperatley. I tried to refactor my code as best as possible and in the end, came out with this coverage:

![InkeddateTest after refactor_LI](https://user-images.githubusercontent.com/72233859/120697490-c7f9f200-c47b-11eb-9894-170e56dfb742.jpg)

I did not receive 100% because of statements like this within the source code:

![red in source code](https://user-images.githubusercontent.com/72233859/120697589-ed86fb80-c47b-11eb-9a45-d2f01a3f3088.png)

However, after comparing with a colleague, he had gotten 100% with those same statements. I do not know why my if statements stay red, but it seems no matter what I try and do they do not change. As time is winding down for this lab, I chose to hand in with what I have right now. Just know that I put a lot of effort trying to come up with various solutions to this issue. 
