#!/usr/bin/php
<?php

function sumOfSquares($num)
{
	$sum = 0;
	for ($x = 1; $x <= $num; $x++) {
		$sum += ($x * $x);
	}
	return $sum;
}

function squareOfSum($num)
{
	$sum = 0;
	for ($x = 1; $x <= $num; $x++) {
		$sum += $x;
	}
	return ($sum * $sum);
}

echo "10:\n";
echo "sum of squares: " . ($sumOfSquares10 = sumOfSquares(10)) . "\n";
echo "square of sum:  " . ($squareOfSum10 = squareOfSum(10)) . "\n";
echo "difference:     " . ($squareOfSum10 - $sumOfSquares10) . "\n";
echo "\n";

echo "100:\n";
echo "sum of squares: " . ($sumOfSquares100 = sumOfSquares(100)) . "\n";
echo "square of sum:  " . ($squareOfSum100 = squareOfSum(100)) . "\n";
echo "difference:     " . ($squareOfSum100 - $sumOfSquares100) . "\n";

