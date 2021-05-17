<template>
    <div class="todo-card">
        <div class="ui card">
            <div class="content">
                <div class="header">{{ title }}</div>
            </div>
            <div class="content">
                <h4 class="ui sub header">Description</h4>
                <div class="ui small feed">
                    <div class="event">
                        <div class="content">
                            <div class="summary">
                                {{ description }}
                            </div>
                        </div>
                    </div>
                </div>
                <H5 class="ui sub header">
                    Created
                </H5>
                <div class="ui small feed">
                <div class="event">
                    <div class="content">
                        <div class="summary">
                        {{ createdOn }}
                        </div>
                    </div>
                </div>
                </div>
                <H5 class="ui sub header">
                    Last Modified
                </H5>
                <div class="event">
                    {{ lastUpdated }}
                </div>
            <div class="extra content">
                <button class="ui button">Edit</button>
            </div>
            </div>
    </div>
    </div>
</template>

<script>

export default {
    name: "TodoCards",
    props: {
        title: String,
        description: String,
        createdOn: String,
        lastUpdated: String,
        }
    }
</script>

