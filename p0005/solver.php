#!/usr/bin/php
<?php
if (isset($argv[1])) {
	$DEBUG = true;
} else {
	$DEBUG = false;
}

function printer($str)
{
	if ($GLOBALS["DEBUG"]) {
		echo $str;
	}
}

function checkDivisors($num, $total)
{
	$debugfinish = false;
	printer("Checking $num...\n");
	for ($x = 1; $x <= $total; $x++) {
		printer("$x:  \t");
		if ($num % $x != 0) {
			printer("nope\n");
			if (!$GLOBALS["DEBUG"]) {
				return false;
			} else {
				$debugfinish = true;
			}
		} else {
			printer("yep\n");
		}
	}
	if ($debugfinish) {
		return false;
	} else {
		return true;
	}
}

echo "start: " . ($start = microtime(true)) . "\n";
for ($x = 2520; $x < 300000000; $x += 2520) {
	if (checkDivisors($x, 20)) {
		echo "yes: $x\n";
		break;
	}
}
echo "end:   " . ($end = microtime(true)) . "\n";
echo "time:  " . ($end - $start) . "\n";

