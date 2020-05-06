---
collection: teaching
title: "Machine Learning with sklearn"
venue: "July 3"
type: "Lecture"
date: 2019-07-03
---

## Reading
Browse [this tutorial](https://scikit-learn.org/stable/tutorial/basic/tutorial.html).

## Key ideas

### About machine learning
* Supervised learning
* Feature variables and target variable
* Classification vs. regression
* Linear regression
* Decision trees

### Sklearn
* The first machine learning method we will look at is linear regression.
See the sklearn documentation:
[https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LinearRegression.html](https://scikit-learn.org/stable/modules/generated/sklearn.linear_model.LinearRegression.html)
* We will also look at a specific measure of error, mean squared log error.
[https://scikit-learn.org/stable/modules/generated/sklearn.metrics.mean_squared_log_error.html](https://scikit-learn.org/stable/modules/generated/sklearn.metrics.mean_squared_log_error.html)
* We wil learn a second machine learning method: Decision Trees. [https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeRegressor.html](https://scikit-learn.org/stable/modules/generated/sklearn.tree.DecisionTreeRegressor.html)

Data for today: [train.csv](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/train.csv) and
[test.csv](https://lgw2.github.io/teaching/csci127-summer-2019/lectures/test.csv), both from [this Kaggle competition](https://www.kaggle.com/c/house-prices-advanced-regression-techniques/).

### Some commands we will run
```

import pandas as pd
import matplotlib.pyplot as plt
import numpy as np

train = pd.read_csv('train.csv')
test = pd.read_csv('test.csv')

train.columns

train['SalePrice'].head()

train['SalePrice'].describe()

plt.hist(train['SalePrice'], bins=25)

train.dtypes

train['Fireplaces'].describe()

plt.plot(train['FullBath'], train['SalePrice'], 'bo', alpha=0.3)


from sklearn.linear_model import LinearRegression

reg_object = LinearRegression()

X = np.array(train['OverallQual']).reshape(-1,1)
y = train['SalePrice']

reg_object.fit(X, y)
reg_object.predict(np.array(1).reshape(-1,1))
reg_object.score(X, y)

X_test = np.array(test['OverallQual']).reshape(-1,1)


#same metric as kaggle:
# note that we must not have negatives in predictions

predictions = reg_object.predict(X)
from sklearn.metrics import mean_squared_log_error
np.sqrt(mean_squared_log_error( y, predictions.clip(min=0)))

X = np.array(list(zip(train['OverallQual'], train['FullBath'])))

from sklearn.model_selection import train_test_split
X_train, X_test, Y_train, Y_test = train_test_split (X, Y, test_size = 0.20, random_state=42)

from sklearn.tree import DecisionTreeRegressor
```
