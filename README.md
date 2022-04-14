# CSC365Project1
This is my project for SUNY Oswego CSC365 Data Structures and Algorithm. The task was to organize bitcoins from a csv using two algorithms. QuickSort and HeapSort. We had to sort them from least to highest using the bitcoin address for alphabet. Sorting them by numbers we used the bitcoin weight. 

I made a bitcoin class to store data from BitcoinHeistData.txt. Turning it into a txt file made it easier to parse. From there I made a Bitcoin arraylist to store everything. As it parsed each bitcoin I added it to the bitcoinsarray. Since the data was big I made a function that returned an arraylist with random bitcoins with the number of bitcoins given. Working with fewer bitcoins made it easier to work with and debug. I took that arraylist with random bitcoins and input it into my algorthms so it can sort. I ouput the data into a output.txt file because when working with larger data sets it was faster outputing it into a txt file then it was printing it out. 

When you run the program it will ask you for a number to insert if you want to sort the address or weight and what sorting algorithm you want to use. 

Quicksort:
Address=1
Weight=2
HeapSort:
Adress=3
Weight=4:

I also showed an analysis on the time of my algorithms. I showed differents sets of elements and showed how long it took them to sorting using weight and address. You can read more on Project 1 Report.pdf
