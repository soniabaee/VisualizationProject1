# Sonia2016.github.io

I try to visualize the unemployment of US states from 1978 - 2016.

## We have US map and time-series chart that show unemployment rates related to each states of US.
![picture8](https://cloud.githubusercontent.com/assets/19417775/19521250/8f41ea98-95d8-11e6-8e62-c0a90deccd6c.png)

## Data Processing
I wrote a htmlparser program in java for retreiving data from BLS website. After this having this data I wrote a script for cleaning data (the Cleandata.csv is attached) that shows the data for each state and also national employee rate.
![html](https://cloud.githubusercontent.com/assets/19417775/19521702/37296b36-95da-11e6-85b1-eefe1acd4732.png)
![script](https://cloud.githubusercontent.com/assets/19417775/19521703/373fd902-95da-11e6-9a76-3aa16e5d4b93.png)

## Some of features of this application
### Feature 1: showigng data for each states according to timeseries duration
If you mouse over on the plot you can see the timeseries related to special state that is highlighted with same color of timeseries on the map. The name of state will be appear at the ends of timeseries. If you mouseover on special timeseries you can see the name of that state as a tooltip.
Allow users to select a state and display its unemployment rate in the graph.
![picture7](https://cloud.githubusercontent.com/assets/19417775/19521245/8f2a5586-95d8-11e6-9f74-2852254e0050.png)

## Feature 2: Reset button
User can reset everything to the default presentation by pressing reset button
![picture9](https://cloud.githubusercontent.com/assets/19417775/19521246/8f2cb470-95d8-11e6-855e-155bef4fcbea.png)

### Feature 3: Zomming on timeseries
You can easily zoom on time series for get the information in details for example one year different month or more than one year.
![picture3](https://cloud.githubusercontent.com/assets/19417775/19521247/8f2cc82a-95d8-11e6-99a0-9727378bd298.png)

### Feature 4: Selecting one/more state(s) according to map and show in timeseries
Users can select multiple or one state on US map and after pressing the draw button. The colors of each state or same as the color on the timeseries.
You can comparision each state with national rate based that is showing with dashed line.
![picture5](https://cloud.githubusercontent.com/assets/19417775/19521244/8f28880a-95d8-11e6-9887-cdb1ca4a472c.png)
If also you mouseover on the state you can see the average employee rate of that state and the name of state as a tooltip.
![picture4](https://cloud.githubusercontent.com/assets/19417775/19521249/8f369ff8-95d8-11e6-9226-a28c294480ba.png)

### Feature 5: National employee rate
By pressing national employee button it will show you the national employee rate that is has 3 colors that shows the states are less than 5 has a green, between 5 to 6 has a yellow and more than 6 has a red colore according to these colors you can also see which duration has this information in the timeseries.
![picture2](https://cloud.githubusercontent.com/assets/19417775/19521251/8f423d18-95d8-11e6-94dd-5b3dd56e4762.png)

### Feature 6: Sudden Drop and Pump
