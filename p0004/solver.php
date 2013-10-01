#!/usr/bin/php
<?php

$largest = 0;
for ($x = 100; $x < 1000; $x++) {
	for ($y = 100; $y < 1000; $y++) {
		$temp = $x * $y;
		if ("$temp" === strrev("$temp")) {
			if ($temp > $largest) {
				$largest = $temp;
			}
		}
	}
}
echo $largest . "\n";

