var packageJSON = require('./package.json');
var path = require('path');
var webpack = require('webpack');

const PATHS = {
    build: path.join(__dirname, 'target', packageJSON.name+'-1.0-SNAPSHOT','js')
};

module.exports = {
    entry: './src/main/webapp/js/main.jsx',

    output: {
        path: PATHS.build,
        filename: 'app-bundle.js'
    },
    module:{
        loaders: [
            { test: /\.js$/, loader: 'babel-loader', exclude: /node_modules/ },
            { test: /\.jsx$/, loader: 'babel-loader', exclude: /node_modules/ }
        ]
    }
};