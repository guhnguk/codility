#!/usr/bin/env python3
# -*- coding: utf8 -*-


import sys


if __name__ == "__main__":
    meal_cost = float(input().strip())
    tip_percent = int(input().strip())
    tax_percent = int(input().strip())

    # tip = meal_cost x tip_percent / 100
    # tax = meal_cost x tax_percent / 100
    # total_cost = meal_cost + tip + tax

    # mealCost = 12, tipPercent = 20, taxPercent = 8
    # tip = 12 x (20 / 100)
    # tax = 12 x (8 / 100)
    # totalCost = mealCost + tip + tax = 12 + 2.4 + 0.96 = 15.36
    # round(totalCost) = 15

    # Expected output: "The total meal cost is 15 dollars."

    tip = meal_cost * (tip_percent / 100)
    tax = meal_cost * (tax_percent / 100)
    total_cost = meal_cost + tip + tax
    total_round_cost = round(total_cost)
    print("The total meal cost is %d dollars." %total_round_cost)
