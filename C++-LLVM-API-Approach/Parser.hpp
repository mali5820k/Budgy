#pragma once
class Parser {
public:
    void Parser();
    void ~Parser();
    struct Token getCurrentToken();
    struct Token getPrevToken();
    void nextToken();

private:
    struct Token CurrentToken;
    struct Token LastToken
};
