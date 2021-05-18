const webpack = require("webpack");

module.exports = {
    devServer: {
        proxy: {
            '^/api': {
                target: 'http://localhost:8080',
                changeOrigin: true,
                secure:false,
                pathRewrite: {'^/api': '/api'},
                logLevel: 'debug' 
            },
        },
        port: 5000
    }/*
    configureWebpack: {
    plugins: [
        new webpack.ProvidePlugin({
            // jquery
            $: 'jquery',
            jQuery: 'jquery',
            'window.jQuery': 'jquery'
        })
        ]
    }*/
}