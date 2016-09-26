# Birthday-Cake
Introduction
It is your birthday! In your culture, there is a birthday tradition that goes as follows:
One-by-one, each of your guests gives you a cake of a certain weight (measured in cakeypounds). You
must either eat the cake or throw it back into the face of the guest. This is not considered rude. However,
it is extremely rude to eat a cake that weighs less than a cake that you have previously eaten; you
must never do this.
Given the weights (in cakeypounds) of the cakes presented (in-order), what is the largest number of
cakeypounds of cake that you can eat during the ceremony without being rude?
Input Specifications
On the first line, you will be given the number of guests 1 ≤ N ≤ 100 at your party. The following N lines
will each be a positive integer 1 ≤ W ≤ 100 representing the weight of the cake presented (in
cakeypounds). These cake weights are given in-order of presentation.
WARNING: Given that there may be up to 100 guests, an entirely un-optimized brute-force approach
may exceed the time limit.
Output Specifications
Output the maximum cakeypounds of cake that you could possibly eat during the ceremony without
being rude (i.e. without eating a cake weighing less than one that you have previously eaten).
Sample Input/Output
Input
3
10
6
6
Output
12
Explanation
Waiting to eat the second cake (6 cakeypounds) allows you to eat the last cake also (6 cakeypounds).
This allows you to eat 12 cakeypounds total without being rude.
