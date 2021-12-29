byte b = 0x00;
// byte b2 = 00000001; // This is still a work in progress for handling different bases, ie base 2, 10, 16, and etc...
int value = 230;
float valueFloat = 20.0;
double valueDouble = 20.00000000;

int8  min8Int = -128;
int8  max8Int = 127;
int16 min16Int = -32768;
int16 max16Int = 32767;
int32 min32Int = -2147483648;
int32 max32Int = 2147483647; // -2^(nbits-1) to 2^(nbits-1) -1 max value
int64 min64Int = -9223372036854775808;
int64 max64Int = 9223372036854775807; // Adding 1 would wrap to -intMin

uint8  max8Uint = 255;
uint16 max16Uint = 65535;
uint32 max32Uint = 4294967295;
uint64 max64Uint = 18446744073709551615; // MAX unsigned int 64 value

// Test min and max integer value ranges:
print min8Int
print min8Int-1

print min16Int
print min16Int-1

print min32Int
print min32Int-1

print min64Int
print min64Int-1

print max8Int
print max8Int+1

print max16Int
print max16Int+1

print max32Int
print max32Int+1

print max64Int
print max64Int+1


// Unsigned int values
print max8Uint
print max8Uint+1

print max16Uint
print max16Uint+1

print max32Uint
print max32Uint+1

print max64Uint
print max64Uint+1

print valueFloat *32
print valueDouble + 2398;
